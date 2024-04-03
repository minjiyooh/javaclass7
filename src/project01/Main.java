package project01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Main extends JFrame {
	private JButton btnLogin, btnJoin, btnStyle, btnFortune, btnExit;
	private JLabel lblMainImg; // 이미지를 표시할 레이블 변수

	public Main() {
		super("코디 메인");

		setSize(800, 600);
		setLocationRelativeTo(null); // 화면 가운데 정렬
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 종료버튼 활성화
		getContentPane().setLayout(null);

		// 패널 생성
		JPanel pn1 = new JPanel();
		pn1.setBackground(new Color(35, 35, 35));
		pn1.setBounds(0, 0, 784, 49);
		getContentPane().add(pn1);
		pn1.setLayout(null);

		// 버튼모음
		JButton btnLogin = new JButton("login");
		JButton btnJoin = new JButton("Join");
		JButton btnStyle = new JButton("오늘의 스타일링");
		JButton btnFortune = new JButton("오늘의 행운의 색");
		JButton btnExit = new JButton("Exit");

		btnLogin.setBackground(new Color(48, 48, 48));
		btnLogin.setForeground(new Color(192, 192, 192));
		btnLogin.setFont(new Font("Dutch801 Rm BT", Font.BOLD, 15));
		btnLogin.setBounds(664, 10, 108, 30);
		btnLogin.setBorderPainted(false); // 테두리 제거
		btnLogin.setFocusPainted(false); // 포커스 테두리 제거
		pn1.add(btnLogin);

		btnJoin.setForeground(new Color(192, 192, 192));
		btnJoin.setBackground(new Color(48, 48, 48));
		btnJoin.setFont(new Font("Dutch801 Rm BT", Font.BOLD, 15));
		btnJoin.setBounds(546, 10, 108, 30);
		btnJoin.setBorderPainted(false); // 테두리 제거
		btnJoin.setFocusPainted(false); // 포커스 테두리 제거
		pn1.add(btnJoin);

		JPanel pn2 = new JPanel();
		pn2.setBackground(new Color(192, 192, 192));
		pn2.setBounds(0, 47, 784, 63);
		getContentPane().add(pn2);
		pn2.setLayout(null);

		btnStyle.setBackground(new Color(192, 192, 192));
		btnStyle.setFont(new Font("경기천년바탕 Regular", Font.BOLD, 13));
		btnStyle.setBounds(93, 10, 134, 43);
		btnStyle.setBorderPainted(false); // 테두리 제거
		btnStyle.setFocusPainted(false); // 포커스 테두리 제거

		pn2.add(btnStyle);

		btnFortune.setBackground(new Color(192, 192, 192));
		btnFortune.setFont(new Font("경기천년바탕 Regular", Font.BOLD, 13));
		btnFortune.setBounds(320, 10, 142, 43);
		btnFortune.setBorderPainted(false); // 테두리 제거
		btnFortune.setFocusPainted(false); // 포커스 테두리 제거
		pn2.add(btnFortune);

		btnExit.setBackground(new Color(192, 192, 192));
		btnExit.setFont(new Font("경기천년바탕 Regular", Font.BOLD, 13));
		btnExit.setBounds(555, 10, 134, 43);
		btnExit.setBorderPainted(false); // 테두리 제거
		btnExit.setFocusPainted(false); // 포커스 테두리 제거
		pn2.add(btnExit);

		JPanel pn3 = new JPanel();
		pn3.setBackground(new Color(255, 255, 255));
		pn3.setBounds(0, 109, 784, 360);
		getContentPane().add(pn3);
		pn3.setLayout(null);

		lblMainImg = new JLabel(""); // 이미지를 표시할 레이블 초기화
		lblMainImg.setForeground(new Color(192, 192, 192));
		lblMainImg.setBackground(new Color(255, 255, 255));
		lblMainImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainImg.setBounds(0, 0, 784, 360);
		pn3.add(lblMainImg); // 이미지 레이블 패널에 추가

		JPanel pn4 = new JPanel();
		pn4.setBackground(new Color(59, 59, 59));
		pn4.setBounds(0, 465, 784, 96);
		getContentPane().add(pn4);
		pn4.setLayout(null);

		JLabel lblCredit = new JLabel("       OOTD");
		lblCredit.setForeground(new Color(240, 240, 240));
		lblCredit.setHorizontalAlignment(SwingConstants.LEFT);
		lblCredit.setFont(new Font("Elephant", Font.PLAIN, 24));
		lblCredit.setBounds(0, 10, 784, 46);
		pn4.add(lblCredit);

		JLabel lblTel = new JLabel(
				"        \r\n    tel.  070-1234-1234         찾아오시는 곳.  충청북도 청주시 서원구 사직대로 109, 4,5층\r\n\r\n           INSTAGRAM. OOTD_OOTD");
		lblTel.setFont(new Font("경기천년제목 Light", Font.BOLD, 14));
		lblTel.setForeground(new Color(231, 231, 231));
		lblTel.setBounds(0, 44, 784, 46);
		pn4.add(lblTel);
		setVisible(true);

		// --------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null); // 윈도우창을 가운데 정렬
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 종료버튼 활성화
		setVisible(true);
		// --------------------- 아래쪽은 메소드 ----------------------------------------

		// join버튼 마우스로 클릭시 수행

		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Sign();
			}
		});

		// login 버튼 마우스 클릭시 수행
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Login();
			}
		});
		// 오늘의 스타일링 버튼 마우스 클릭시 수행
		btnStyle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Style();
			}
		});

		// 오늘의 행운의색 버튼 마우스 클릭시 수행

		btnFortune.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Fortune();

			}
		});

		// Exit 버튼 마우스 클릭시 수행

		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		// 이미지 경로
		String[] imagePaths = { "projectImg/11.jpg", "projectImg/22.jpg", "projectImg/33.jpg", "projectImg/44.jpg" };

		// 이미지 경로 출력
		System.out.println("이미지 경로:");
		for (String path : imagePaths) {
			System.out.println(path);
		}

		// 타이머가 실행되는지 확인
		System.out.println("타이머 시작 전");
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			int currentIndex = 0;

			@Override
			public void run() {
				// 다음 이미지로 변경
				lblMainImg.setIcon(new ImageIcon(imagePaths[currentIndex]));

				// 다음 이미지 인덱스로 이동
				currentIndex = (currentIndex + 1) % imagePaths.length;
			}
		}, 0, 2000); // 딜레이: 0ms, 반복 간격: 2000ms (2초)

	}

	public static void main(String[] args) {
		new Main();
	}
}