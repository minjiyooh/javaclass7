package project01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
    private JTextField textFieldID;
    private JPasswordField passwordFieldPW;

    public Login() {
        super("로그인 화면");
        setSize(514, 386);

        getContentPane().setLayout(null);

        JPanel pn1 = new JPanel();
        pn1.setBackground(new Color(255, 255, 255));
        pn1.setBounds(0, 0, 498, 110);
        getContentPane().add(pn1);
        pn1.setLayout(null);

        JLabel lblLoginImg = new JLabel("");
        lblLoginImg.setBounds(0, 0, 496, 102);
        pn1.add(lblLoginImg);
        lblLoginImg.setHorizontalAlignment(JLabel.CENTER); //사진 가운데정렬
        lblLoginImg.setVerticalAlignment(JLabel.CENTER);

        JPanel pn2 = new JPanel();
        pn2.setBackground(new Color(255, 255, 255));
        pn2.setBounds(0, 106, 498, 161);
        getContentPane().add(pn2);
        pn2.setLayout(null);

        JLabel lblNewLabel = new JLabel("ID ");
        lblNewLabel.setForeground(new Color(0, 64, 128));
        lblNewLabel.setFont(new Font("경기천년제목 Medium", Font.BOLD, 24));
        lblNewLabel.setBounds(32, 35, 63, 36);
        pn2.add(lblNewLabel);

        JLabel lblPW = new JLabel("PW");
        lblPW.setForeground(new Color(0, 64, 128));
        lblPW.setFont(new Font("경기천년제목 Medium", Font.BOLD, 24));
        lblPW.setBounds(28, 97, 83, 36);
        pn2.add(lblPW);

        textFieldID = new JTextField();
        textFieldID.setBounds(135, 35, 240, 36);
        pn2.add(textFieldID);
        textFieldID.setColumns(10);

        passwordFieldPW = new JPasswordField();
        passwordFieldPW.setBounds(135, 102, 240, 36);
        pn2.add(passwordFieldPW);

        JPanel pn3 = new JPanel();
        pn3.setBackground(new Color(255, 255, 255));
        pn3.setBounds(0, 266, 498, 81);
        getContentPane().add(pn3);
        pn3.setLayout(null);

        JButton btnLogin = new JButton("로 그 인");
        btnLogin.setBackground(new Color(0, 55, 111));
        btnLogin.setForeground(new Color(232, 232, 232));
        btnLogin.setFont(new Font("경기천년제목 Medium", Font.BOLD, 34));
        btnLogin.setBounds(129, 10, 261, 43);
        btnLogin.setBorderPainted(false);
        btnLogin.setFocusPainted(false);
        pn3.add(btnLogin);
        
      
        JLabel[] lblLoginImgs = new JLabel[1];
        lblLoginImgs[0] = new JLabel(new ImageIcon("projectimg/Login.jpg"));
        lblLoginImgs[0].setBounds(0, 0, 496, 102);
        pn1.add(lblLoginImgs[0]);
     // --------------------- 위쪽은 UI ----------------------------------------
    		setLocationRelativeTo(null); // 윈도우창을 가운데 정렬
    		setResizable(false);
    		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 종료버튼 활성화
    		setVisible(true);
    		// --------------------- 아래쪽은 메소드 ----------------------------------------
    		
        // 로그인버튼 마우스로 실행 수행 처리
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = textFieldID.getText().trim();
                String password = new String(passwordFieldPW.getPassword()).trim();
                // 로그인 처리 메소드 호출
                login(id, password);
            }
        });

        setLocationRelativeTo(null); // 윈도우창을 가운데 정렬
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 종료버튼 활성화
        setVisible(true);
    }

    // 로그인 처리 메소드
    private void login(String id, String password) {
        // DAO 객체 생성
        ProjectDAO dao = new ProjectDAO();
        // 로그인 시도
        boolean result = dao.login(id, password);
        if (result) {
            // 로그인 성공 시
            JOptionPane.showMessageDialog(this, "로그인 성공!");
            dispose();
            // 로그인 성공 후 처리할 내용 추가
        } else {
            // 로그인 실패 시
            JOptionPane.showMessageDialog(this, "로그인 실패. 아이디 또는 비밀번호를 확인하세요.");
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
