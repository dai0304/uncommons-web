/*
 * Copyright 2011 Daisuke Miyamoto.
 * Created on 2012/06/19
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
package jp.xet.uncommons.wicket.gp.messagecontainer;

import java.util.Collection;

import jp.xet.uncommons.wicket.behavior.VisibleIfCollectionIsNotEmptyBehavior;

import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.model.IModel;
import org.apache.wicket.util.lang.Args;

/**
 * {@link Collection}が空<strong>でない</strong>時だけ表示するコンテナ。
 * 
 * @since 1.8
 * @version $Id: CollectionNotEmptyMessage.java 7233 2012-07-27 05:18:46Z miyamoto $
 * @author daisuke
 */
@SuppressWarnings("serial")
public class CollectionNotEmptyMessage extends WebMarkupContainer {
	
	/**
	 * インスタンスを生成する。
	 * 
	 * @param id The non-null id of this component
	 * @param model The component's model
	 * @throws IllegalArgumentException 引数に{@code null}を与えた場合
	 * @since 1.8
	 */
	public CollectionNotEmptyMessage(String id, IModel<? extends Collection<?>> model) {
		super(id);
		Args.notNull(model, "model");
		add(new VisibleIfCollectionIsNotEmptyBehavior(model));
	}
}
