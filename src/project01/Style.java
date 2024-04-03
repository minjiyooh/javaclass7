package project01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Style extends JFrame {
	private JButton btnHome, btnNormal, btnSogae, btnDate, btnMoim, btnWork, btnSports;
	private JLabel lblStyle; // 스타일 이미지 레이블
	private ImageIcon[] imgNormal; // 일상 이미지 배열
	private ImageIcon[] imgSogae;
	private ImageIcon[] imgDate;
	private ImageIcon[] imgMoim;
	private ImageIcon[] imgWork;
	private ImageIcon[] imgSports;
	private ImageIcon homeImage;
	private int previousIndex = -1; // 이전에 선택된 이미지 인덱스를 저장하기 위한 변수

	public Style() {
		super("코디 메인");
		setSize(800, 600);

		JPanel pn1 = new JPanel();
		pn1.setBackground(new Color(128, 128, 128));
		pn1.setBounds(0, 0, 160, 520);
		getContentPane().add(pn1);
		pn1.setLayout(null);

		btnHome = new JButton("Home");
		btnHome.setFont(new Font("경기천년바탕 Regular", Font.BOLD, 14));
		btnHome.setFocusPainted(false);
		btnHome.setBorderPainted(false);
		btnHome.setBackground(Color.GRAY);
		btnHome.setBounds(12, 30, 136, 40);
		pn1.add(btnHome);

		btnNormal = new JButton("일상");
		btnNormal.setBounds(12, 100, 136, 40);
		btnNormal.setFont(new Font("경기천년바탕 Regular", Font.BOLD, 14));
		btnNormal.setBackground(new Color(128, 128, 128));
		btnNormal.setBorderPainted(false);
		btnNormal.setFocusPainted(false);
		pn1.add(btnNormal);

		btnSogae = new JButton("소개팅");
		btnSogae.setBounds(12, 170, 136, 40);
		btnSogae.setFont(new Font("경기천년바탕 Regular", Font.BOLD, 14));
		btnSogae.setBackground(new Color(128, 128, 128));
		btnSogae.setBorderPainted(false);
		btnSogae.setFocusPainted(false);
		pn1.add(btnSogae);

		btnDate = new JButton("데이트");
		btnDate.setBounds(12, 240, 136, 40);
		btnDate.setFont(new Font("경기천년바탕 Regular", Font.BOLD, 14));
		btnDate.setBackground(new Color(128, 128, 128));
		btnDate.setBorderPainted(false);
		btnDate.setFocusPainted(false);
		pn1.add(btnDate);

		btnMoim = new JButton("모임");
		btnMoim.setBounds(12, 310, 136, 40);
		btnMoim.setFont(new Font("경기천년바탕 Regular", Font.BOLD, 14));
		btnMoim.setBackground(new Color(128, 128, 128));
		btnMoim.setBorderPainted(false);
		btnMoim.setFocusPainted(false);
		pn1.add(btnMoim);

		btnWork = new JButton("출근");
		btnWork.setBounds(12, 380, 136, 40);
		btnWork.setFont(new Font("경기천년바탕 Regular", Font.BOLD, 14));
		btnWork.setBackground(new Color(128, 128, 128));
		btnWork.setBorderPainted(false);
		btnWork.setFocusPainted(false);
		pn1.add(btnWork);

		JButton btnSports = new JButton("운동");
		btnSports.setBounds(12, 450, 136, 40);
		btnSports.setFont(new Font("경기천년바탕 Regular", Font.BOLD, 14));
		btnSports.setBackground(new Color(128, 128, 128));
		btnSports.setBorderPainted(false);
		btnSports.setFocusPainted(false);
		pn1.add(btnSports);

		JPanel pn2 = new JPanel();
		pn2.setBackground(new Color(255, 255, 255));
		pn2.setBounds(161, 0, 623, 520);
		getContentPane().add(pn2);
		pn2.setLayout(null);

		lblStyle = new JLabel(""); // 스타일 이미지 레이블 초기화
		lblStyle.setIcon(new ImageIcon("projectImg\\OOTD.jpg"));
		lblStyle.setBounds(0, 0, 623, 520);
		pn2.add(lblStyle);

		JPanel pn3 = new JPanel();
		pn3.setBackground(new Color(55, 55, 55));
		pn3.setBounds(0, 517, 784, 44);
		getContentPane().add(pn3);
		pn3.setLayout(null);

		JLabel lblLogo = new JLabel("OOTD");
		lblLogo.setFont(new Font("Elephant", Font.PLAIN, 17));
		lblLogo.setForeground(new Color(192, 192, 192));
		lblLogo.setBounds(694, 10, 78, 24);
		pn3.add(lblLogo);

		// 홈이미지 로드
		homeImage = new ImageIcon("projectimg/OOTD.jpg");

		// 일상 이미지 로드
		imgNormal = new ImageIcon[4];
		imgNormal[0] = new ImageIcon("ImgNormal/Normal1.jpg");
		imgNormal[1] = new ImageIcon("ImgNormal/Normal2.jpg");
		imgNormal[2] = new ImageIcon("ImgNormal/Normal3.jpg");
		imgNormal[3] = new ImageIcon("ImgNormal/Normal4.jpg");

		// 소개팅 이미지 로드
		imgSogae = new ImageIcon[4];
		imgSogae[0] = new ImageIcon("ImgSogae/sogae1.jpg");
		imgSogae[1] = new ImageIcon("ImgSogae/sogae2.jpg");
		imgSogae[2] = new ImageIcon("ImgSogae/sogae3.jpg");
		imgSogae[3] = new ImageIcon("ImgSogae/sogae4.jpg");

		// 데이트 이미지 로드

		imgDate = new ImageIcon[4];
		imgDate[0] = new ImageIcon("ImgDate/Date1.jpg");
		imgDate[1] = new ImageIcon("ImgDate/Date2.jpg");
		imgDate[2] = new ImageIcon("ImgDate/Date3.jpg");
		imgDate[3] = new ImageIcon("ImgDate/Date4.jpg");

		// 모임 이미지 로드

		imgMoim = new ImageIcon[4];
		imgMoim[0] = new ImageIcon("ImgMoim/Moim1.jpg");
		imgMoim[1] = new ImageIcon("ImgMoim/Moim2.jpg");
		imgMoim[2] = new ImageIcon("ImgMoim/Moim3.jpg");
		imgMoim[3] = new ImageIcon("ImgMoim/Moim4.jpg");

		// 출근 이미지 로드
		imgWork = new ImageIcon[4];
		imgWork[0] = new ImageIcon("ImgWork/Work1.jpg");
		imgWork[1] = new ImageIcon("ImgWork/Work2.jpg");
		imgWork[2] = new ImageIcon("ImgWork/Work3.jpg");
		imgWork[3] = new ImageIcon("ImgWork/Work4.jpg");

		// 운동 이미지 로드

		imgSports = new ImageIcon[4];
		imgSports[0] = new ImageIcon("ImgSports/Sports1.jpg");
		imgSports[1] = new ImageIcon("ImgSports/Sports2.jpg");
		imgSports[2] = new ImageIcon("ImgSports/Sports3.jpg");
		imgSports[3] = new ImageIcon("ImgSports/Sports4.jpg");

		lblStyle.setHorizontalAlignment(JLabel.CENTER); // 사진 가운데정렬
		lblStyle.setVerticalAlignment(JLabel.CENTER);

		// --------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null); // 윈도우창을 가운데 정렬
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 종료버튼 활성화
		setVisible(true);
		// --------------------- 아래쪽은 메소드 ----------------------------------------

		// 메인으로 가기
		btnHome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblStyle.setIcon(homeImage);
				dispose();
				new Main();
			}
		});

		// 일상 버튼을 마우스로 클릭시 수행
		btnNormal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayRandomImage(imgNormal);
			}
		});

		// 소개팅 버튼을 마우스로 클릭시 수행
		btnSogae.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayRandomImage(imgSogae);
			}
		});

		// 데이트 버튼을 마우스로 클릭시 수행
		btnDate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayRandomImage(imgDate);
			}
		});

		// 모임 버튼을 마우스로 클릭시 수행
		btnMoim.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayRandomImage(imgMoim);
			}
		});

		// 출근 버튼을 마우스로 클릭시 수행
		btnWork.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayRandomImage(imgWork);
			}
		});

		// 운동 버튼을 마우스로 클릭시 수행
		btnSports.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				displayRandomImage(imgSports);
			}
		});
	}

	// displayRandomImage() 메소드 정의
	private void displayRandomImage(ImageIcon[] imageArray) {
		Random rand = new Random();
		int index;

		// 중복되지 않는 이미지를 선택할 때까지 반복
		do {
			index = rand.nextInt(imageArray.length);
		} while (index == previousIndex); // 이전에 선택된 이미지와 중복되지 않도록 처리

		System.out.println("index : " + index);
		ImageIcon randomImage = imageArray[index];
		previousIndex = index; // 현재 선택된 이미지의 인덱스를 이전에 선택된 이미지 인덱스로 설정
		// 이미지 레이블에 설정
		lblStyle.setIcon(randomImage);

	}

	public static void main(String[] args) {
		new Style();
	}
}
