/*
 * Copyright 2012 Daisuke Miyamoto.
 * Created on 2012/03/28
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.xet.uncommons.wicket.aggregateresource;

/**
 * TODO for daisuke
 * 
 * @since 1.0.0
 * @version $Id$
 * @author daisuke
 */
import org.apache.wicket.markup.html.DecoratingHeaderResponse;
import org.apache.wicket.markup.html.IHeaderResponse;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.ResourceReference;
import org.apache.wicket.resource.filtering.JavaScriptFilteredIntoFooterHeaderResponse;

/**
 * An {@link IHeaderResponse} that uses grouping for the CSS resources, i.e. can load several .css
 * files with one http request, and load the JavaScript resources at the footer of the body
 */
public class GroupingAndFilteringHeaderResponse extends DecoratingHeaderResponse {
	
	private final GroupingHeaderResponse groupingHeaderResponse;
	
	
	/**
	 * Uses {@link JavaScriptFilteredIntoFooterHeaderResponse} for rendering all JavaScript
	 * resources and {@link GroupingHeaderResponse} for all CSS resources
	 * 
	 * @param groupingHeaderResponse {@link GroupingHeaderResponse}
	 * @param filteredIntoFooterHeaderResponse {@link JavaScriptFilteredIntoFooterHeaderResponse}
	 */
	public GroupingAndFilteringHeaderResponse(GroupingHeaderResponse groupingHeaderResponse,
			JavaScriptFilteredIntoFooterHeaderResponse filteredIntoFooterHeaderResponse) {
		super(filteredIntoFooterHeaderResponse);
		
		this.groupingHeaderResponse = groupingHeaderResponse;
	}
	
	/**
	 * @see org.apache.wicket.markup.html.DecoratingHeaderResponse#close()
	 */
	@Override
	public void close() {
		groupingHeaderResponse.close();
		super.close();
	}
	
	@Override
	public void renderCSS(CharSequence css, String id) {
		groupingHeaderResponse.renderCSS(css, id);
	}
	
	@Override
	public void renderCSSReference(ResourceReference reference) {
		groupingHeaderResponse.renderCSSReference(reference);
	}
	
	@Override
	public void renderCSSReference(ResourceReference reference, PageParameters pageParameters, String media) {
		groupingHeaderResponse.renderCSSReference(reference, pageParameters, media);
	}
	
	@Override
	public void renderCSSReference(ResourceReference reference, String media) {
		groupingHeaderResponse.renderCSSReference(reference, media);
	}
	
	@Override
	public void renderCSSReference(String url) {
		groupingHeaderResponse.renderCSSReference(url);
	}
	
	@Override
	public void renderCSSReference(String url, String media) {
		groupingHeaderResponse.renderCSSReference(url, media);
	}
}
