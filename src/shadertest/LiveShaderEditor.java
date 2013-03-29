package shadertest;

import javax.swing.JFrame;

import nl.esciencecenter.esight.ESightNewtWindow;

public class LiveShaderEditor {
    public static void main(String[] arguments) {
        String cmdlnfileName = null;
        String path = "";

        path = System.getProperty("user.dir");

        final LiveShaderEditorGLEventListener window = new LiveShaderEditorGLEventListener(
                LiveShaderEditorInputHandler.getInstance());
        final LiveShaderEditorInterfacePanel panel = new LiveShaderEditorInterfacePanel(
                window, path, cmdlnfileName);
        // }
        //
        // public void makeWindow() {
        new ESightNewtWindow(true, LiveShaderEditorInputHandler.getInstance(),
                window, 2000, 2000, "Live Shader Editor");

        // Create the frame
        final JFrame frame = new JFrame("- LSE -");
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent arg0) {
                System.exit(0);
            }
        });

        frame.setSize(100, 100);

        frame.setResizable(false);

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    frame.getContentPane().add(panel);
                } catch (final Exception e) {
                    e.printStackTrace(System.err);
                    System.exit(1);
                }
            }
        });

        frame.setVisible(true);
    }
}
