/*
 * Copyright 2011 Daisuke Miyamoto.
 * Created on 2011/11/04
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

import java.util.List;

import org.apache.wicket.markup.html.form.upload.FileUpload;
import org.apache.wicket.markup.html.form.upload.FileUploadField;
import org.apache.wicket.model.IModel;

/**
 * {@link FileUploadField}用{@link FormComponentPanel}実装クラス。
 * 
 * @since 1.0
 * @version $Id$
 * @author daisuke
 */
@SuppressWarnings("serial")
public class FileUploadFieldPanel extends FormComponentPanel<List<FileUpload>, FileUploadField> {
	
	/**
	 * インスタンスを生成する。
	 * 
	 * @param id The non-null id of this component
	 * @param model The component's model
	 */
	public FileUploadFieldPanel(String id, IModel<List<FileUpload>> model) {
		super(id, model);
	}
	
	@Override
	protected FileUploadField createFormComponent(String id, IModel<List<FileUpload>> model) {
		return new FileUploadField(id, model);
	}
}
