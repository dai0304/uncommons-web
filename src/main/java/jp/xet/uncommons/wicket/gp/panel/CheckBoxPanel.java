/*
 * Copyright 2011 Daisuke Miyamoto.
 * Created on 2011/10/14
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
package jp.xet.uncommons.wicket.gp.panel;

import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;

/**
 * {@link CheckBox}をラップした{@link Panel}クラス。
 * 
 * @since 1.0
 * @version $Id$
 * @author daisuke
 */
@SuppressWarnings("serial")
public class CheckBoxPanel extends FormComponentPanel<Boolean, CheckBox> {
	
	/**
	 * インスタンスを生成する。
	 * 
	 * @param id The non-null id of this component
	 * @param model The component's model
	 */
	public CheckBoxPanel(String id, IModel<Boolean> model) {
		super(id, model);
	}
	
	@Override
	protected CheckBox createFormComponent(String id, IModel<Boolean> model) {
		return new CheckBox(id, model);
	}
}
