package shadertest;

import nl.esciencecenter.esight.ESightNewtWindow;

public class LiveShaderEditor {
    public static void main(String[] arguments) {
        final LiveShaderEditorGLEventListener window = new LiveShaderEditorGLEventListener(
                LiveShaderEditorInputHandler.getInstance());

        new ESightNewtWindow(true, LiveShaderEditorInputHandler.getInstance(), window, 1024, 768, "Live Shader Editor");

    }
}
