package project01;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Fortune extends JFrame {
	JButton btnMouse, btnCow, btnTiger, btnRabbit, btnDragon, btnSnake, btnHorse, btnSheep, btnMonkey, btnRooster, btnDog,
			btnPig;
	private ImageIcon[] imgMouse;
	private ImageIcon[] imgCow;
	private ImageIcon[] imgTiger;
	private ImageIcon[] imgRabbit;
	private ImageIcon[] imgDragon;
	private ImageIcon[] imgSnake;
	private ImageIcon[] imgHorse;
	private ImageIcon[] imgSheep;
	private ImageIcon[] imgMonkey;
	private ImageIcon[] imgRooster;
	private ImageIcon[] imgDog;
	private ImageIcon[] imgPig;
	private JButton btnGoMain;

	public Fortune() {

		super("오늘의 행운의 색");
		setSize(800, 600);

		// --------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null); // 윈도우창을 가운데 정렬
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 종료버튼 활성화
		getContentPane().setLayout(null);

		JPanel pn1 = new JPanel();
		pn1.setToolTipText("");
		pn1.setBackground(new Color(255, 206, 206));
		pn1.setBounds(0, 0, 784, 58);
		getContentPane().add(pn1);
		pn1.setLayout(null);

		JLabel lblTitle = new JLabel("오 늘 의  행 운 의  색!");
		lblTitle.setForeground(new Color(105, 105, 105));
		lblTitle.setBackground(new Color(255, 198, 198));
		lblTitle.setFont(new Font("경기천년바탕 Regular", Font.BOLD, 18));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(0, 0, 784, 58);
		pn1.add(lblTitle);

		JPanel pn2 = new JPanel();
		pn2.setBackground(new Color(255, 255, 255));
		pn2.setBounds(0, 56, 784, 120);
		getContentPane().add(pn2);
		pn2.setLayout(null);

		btnMouse = new JButton("쥐 띠");

		btnMouse.setFont(new Font("경기천년제목 Light", Font.PLAIN, 16));
		btnMouse.setForeground(new Color(85, 85, 85));
		btnMouse.setBackground(new Color(255, 203, 179));
		btnMouse.setBounds(23, 21, 102, 33);
		btnMouse.setFocusPainted(false);
		btnMouse.setBorderPainted(false);
		pn2.add(btnMouse);

		btnCow = new JButton("소 띠");

		btnCow.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 16));
		btnCow.setBackground(new Color(255, 203, 179));
		btnCow.setBounds(150, 21, 102, 33);
		btnCow.setFocusPainted(false);
		btnCow.setBorderPainted(false);
		pn2.add(btnCow);

		btnTiger = new JButton("호랑이띠");

		btnTiger.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 16));
		btnTiger.setBackground(new Color(255, 203, 179));
		btnTiger.setBounds(278, 21, 102, 33);
		btnTiger.setFocusPainted(false);
		btnTiger.setBorderPainted(false);
		pn2.add(btnTiger);

		btnRabbit = new JButton("토 끼 띠");

		btnRabbit.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 16));
		btnRabbit.setBackground(new Color(255, 203, 179));
		btnRabbit.setBounds(402, 21, 102, 33);
		btnRabbit.setFocusPainted(false);
		btnRabbit.setBorderPainted(false);
		pn2.add(btnRabbit);

		JButton btnDragon = new JButton("용 띠");

		btnDragon.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 16));
		btnDragon.setBackground(new Color(255, 203, 179));
		btnDragon.setBounds(532, 21, 102, 33);
		btnDragon.setFocusPainted(false);
		btnDragon.setBorderPainted(false);
		pn2.add(btnDragon);

		btnSnake = new JButton("뱀 띠");

		btnSnake.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 16));
		btnSnake.setBackground(new Color(255, 203, 179));
		btnSnake.setBounds(670, 21, 102, 33);
		btnSnake.setFocusPainted(false);
		btnSnake.setBorderPainted(false);
		pn2.add(btnSnake);

		btnHorse = new JButton("말 띠");

		btnHorse.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 16));
		btnHorse.setBackground(new Color(255, 203, 179));
		btnHorse.setBounds(23, 69, 102, 33);
		btnHorse.setFocusPainted(false);
		btnHorse.setBorderPainted(false);
		pn2.add(btnHorse);

		btnSheep = new JButton("양 띠");

		btnSheep.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 16));
		btnSheep.setBackground(new Color(255, 203, 179));
		btnSheep.setBounds(150, 69, 102, 33);
		btnSheep.setFocusPainted(false);
		btnSheep.setBorderPainted(false);
		pn2.add(btnSheep);

		btnMonkey = new JButton("원숭이띠");

		btnMonkey.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 16));
		btnMonkey.setBackground(new Color(255, 203, 179));
		btnMonkey.setBounds(278, 69, 102, 33);
		btnMonkey.setFocusPainted(false);
		btnMonkey.setBorderPainted(false);
		pn2.add(btnMonkey);

		btnRooster = new JButton("닭 띠");

		btnRooster.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 16));
		btnRooster.setBackground(new Color(255, 203, 179));
		btnRooster.setBounds(402, 69, 102, 33);
		btnRooster.setFocusPainted(false);
		btnRooster.setBorderPainted(false);
		pn2.add(btnRooster);

		btnDog = new JButton("개 띠");

		btnDog.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 16));
		btnDog.setBackground(new Color(255, 203, 179));
		btnDog.setBounds(536, 69, 102, 33);
		btnDog.setFocusPainted(false);
		btnDog.setBorderPainted(false);
		pn2.add(btnDog);

		btnPig = new JButton("돼 지 띠");

		btnPig.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 16));
		btnPig.setBackground(new Color(255, 203, 179));
		btnPig.setBounds(670, 69, 102, 33);
		btnPig.setFocusPainted(false);
		btnPig.setBorderPainted(false);
		pn2.add(btnPig);

		JPanel pn3 = new JPanel();
		pn3.setBackground(new Color(255, 255, 255));
		pn3.setBounds(0, 174, 784, 329);
		getContentPane().add(pn3);
		pn3.setLayout(null);

		JLabel lblFortune = new JLabel("");
		lblFortune.setBounds(0, 0, 784, 329);
		pn3.add(lblFortune);

		JPanel pn4 = new JPanel();
		pn4.setBackground(new Color(128, 128, 128));
		pn4.setForeground(new Color(128, 128, 128));
		pn4.setBounds(0, 503, 784, 58);
		getContentPane().add(pn4);
		pn4.setLayout(null);

		JLabel lblLogo = new JLabel("    OOTD");
		lblLogo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLogo.setFont(new Font("Elephant", Font.PLAIN, 31));
		lblLogo.setBounds(231, 0, 528, 58);
		pn4.add(lblLogo);

		btnGoMain = new JButton("메인으로");
		btnGoMain.setBackground(new Color(142, 142, 142));
		btnGoMain.setFont(new Font("경기천년바탕 Regular", Font.PLAIN, 14));
		btnGoMain.setBounds(12, 10, 117, 38);
		btnTiger.setFocusPainted(false);
		btnTiger.setBorderPainted(false);
		pn4.add(btnGoMain);

		// 쥐띠 이미지 로드
		imgMouse = new ImageIcon[1];
		imgMouse[0] = new ImageIcon("ImgFortune/Mouse.jpg");

		// 소띠 이미지 로드
		imgCow = new ImageIcon[1];
		imgCow[0] = new ImageIcon("ImgFortune/Cow.jpg");

		// 호랑이띠 이미지 로드
		imgTiger = new ImageIcon[1];
		imgTiger[0] = new ImageIcon("ImgFortune/Tiger.jpg");

		// 토끼띠 이미지 로드
		imgRabbit = new ImageIcon[1];
		imgRabbit[0] = new ImageIcon("ImgFortune/Rabbit.jpg");

		// 용띠 이미지 로드
		imgDragon = new ImageIcon[1];
		imgDragon[0] = new ImageIcon("ImgFortune/Dragon.jpg");

		// 뱀띠 이미지 로드
		imgSnake = new ImageIcon[1];
		imgSnake[0] = new ImageIcon("ImgFortune/Snake.jpg");

		// 말띠 이미지 로드
		imgHorse = new ImageIcon[1];
		imgHorse[0] = new ImageIcon("ImgFortune/Horse.jpg");

		// 양띠 이미지 로드
		imgSheep = new ImageIcon[1];
		imgSheep[0] = new ImageIcon("ImgFortune/Sheep.jpg");

		// 원숭이띠 이미지 로드
		imgMonkey = new ImageIcon[1];
		imgMonkey[0] = new ImageIcon("ImgFortune/Monkey.jpg");

		// 닭띠 이미지 로드
		imgRooster = new ImageIcon[1];
		imgRooster[0] = new ImageIcon("ImgFortune/Rooster.jpg");

		// 개띠 이미지 로드
		imgDog = new ImageIcon[1];
		imgDog[0] = new ImageIcon("ImgFortune/Dog.jpg");

		// 돼지띠 이미지 로드
		imgPig = new ImageIcon[1];
		imgPig[0] = new ImageIcon("ImgFortune/Pig.jpg");

		lblFortune.setHorizontalAlignment(JLabel.CENTER);
		lblFortune.setVerticalAlignment(JLabel.CENTER);

		// --------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null); // 윈도우창을 가운데 정렬
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 종료버튼 활성화
		setVisible(true);
		// --------------------- 아래쪽은 메소드 ----------------------------------------

		
		//메인으로 가기 
		btnGoMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Main();
			}
		});

		// 쥐띠 버튼을 마우스로 클릭시 수행
		btnMouse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFortune.setIcon(imgMouse[0]); //
			}
		});

		// 소띠 버튼을 마우스로 클릭시 수행
		btnCow.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFortune.setIcon(imgCow[0]); //
			}
		});

		// 호랑이띠 버튼을 마우스로 클릭시 수행
		btnTiger.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFortune.setIcon(imgTiger[0]); //
			}
		});

		// 토끼띠 버튼을 마우스로 클릭시 수행

		btnRabbit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFortune.setIcon(imgRabbit[0]); //
			}
		});

		// 용띠 버튼을 마우스로 클릭시 수행

		btnDragon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFortune.setIcon(imgDragon[0]); //
			}
		});

		// 뱀띠 버튼을 마우스로 클릭시 수행
		btnSnake.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFortune.setIcon(imgSnake[0]); //
			}
		});

		// 말띠 버튼을 마우스로 클릭시 수행

		btnHorse.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFortune.setIcon(imgHorse[0]); //
			}
		});

		// 양띠 버튼을 마우스로 클릭시 수행

		btnSheep.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFortune.setIcon(imgSheep[0]); //
			}
		});

		// 원숭이띠 버튼을 마우스로 클릭시 수행

		btnMonkey.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFortune.setIcon(imgMonkey[0]); //
			}
		});

		// 닭띠 버튼을 마우스로 클릭시 수행

		btnRooster.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFortune.setIcon(imgRooster[0]); //
			}
		});

		// 개띠 버튼을 마우스로 클릭시 수행
		btnDog.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFortune.setIcon(imgDog[0]); //
			}
		});
		// 돼지띠 버튼을 마우스로 클릭시 수행

		btnPig.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFortune.setIcon(imgPig[0]); //
			}
		});
	}

	public static void main(String[] args) {
		new Fortune();
	}
}
