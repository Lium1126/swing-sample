import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * SwingSample
 */
public class SwingSample extends javax.swing.JFrame {

    // Jで始まってるのは画面制御に関わるもの
    private JLabel label;     // 画面に配置するラベル
    private JButton button;   // 画面に配置するボタン

    /**
     * メインメソッド
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // イベントキューに画面の起動スレッドを追加
        EventQueue.invokeLater(() -> {
            // 新しく画面を作成して表示を切り替えてください
            new SwingSample().setVisible(true);
        });
    }

    /**
     * デフォルトコンストラクタ
     */
    public SwingSample() {

        // 画面の配置、初期値の設定をここで行う

        setTitle("タイトル");

        // ウィンドウを閉じたら終了させる
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // ウィンドウ起動位置とウィンドウサイズの指定
        setBounds(100, 100, 300, 200);

        // ラベル設定
        label = new JLabel();
        label.setText("Hello, World!!");
        // ラベルを画面中央に設定
        getContentPane().add(label, BorderLayout.CENTER);

        // ボタン設定
        button = new JButton();
        button.setText("Click!!");
        // クリック時のイベント設定
        /*
        button.addActionListener((ActionEvent ae) -> {
            label.setText("Hello, Swing!!");
        });
        */
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (label.getText().equals("Hello, Swing!!")) {
                    label.setText("Hello, World!!");
                } else {
                    label.setText("Hello, Swing!!");
                }
            }
        });
        // 画面下部にボタンを配置
        getContentPane().add(button, BorderLayout.SOUTH);

    }
}
