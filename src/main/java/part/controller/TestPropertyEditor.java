package part.controller;

import java.beans.PropertyEditorSupport;

/**
 * @author Neo
 * @date 2020/8/22 11:44
 */
public class TestPropertyEditor extends PropertyEditorSupport {
    public TestPropertyEditor() {
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        super.setAsText(text);
    }
}
