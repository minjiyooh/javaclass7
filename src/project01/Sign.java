package project01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Sign extends JFrame {
	JButton btnSign, btnDuplicate;
	JComboBox comboMM;
	JLabel lblID, lblPassword, lblName, lblBirth, lblGender;

	ProjectDAO dao = new ProjectDAO();

	ProjectVO vo = new ProjectVO();

	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtYY;
	private JTextField txtDD;
	private JPasswordField FieldPassword1;
	private JTextField txtTel2;
	private JTextField txtTel3;
	private JPasswordField passwordField2;
	private final ButtonGroup buttonGroupGender = new ButtonGroup();
	private JRadioButton rdFemale;
	private JComboBox cbTel1;

	public Sign() {
		setSize(400, 598);
		getContentPane().setLayout(null);

		JPanel lblLogo = new JPanel();
		lblLogo.setBackground(new Color(128, 128, 128));
		lblLogo.setBounds(0, 0, 386, 51);
		getContentPane().add(lblLogo);
		lblLogo.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("OOTD");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Elephant", Font.BOLD, 24));
		lblNewLabel_1.setBounds(0, 0, 391, 51);
		lblLogo.add(lblNewLabel_1);

		JPanel pn2 = new JPanel();
		pn2.setBackground(new Color(192, 192, 192));
		pn2.setBounds(0, 50, 386, 424);
		getContentPane().add(pn2);
		pn2.setLayout(null);

		lblID = new JLabel("ID");
		lblID.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 13));
		lblID.setBounds(12, 10, 143, 27);
		pn2.add(lblID);

		lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 13));
		lblPassword.setBounds(12, 69, 143, 27);
		pn2.add(lblPassword);

		lblName = new JLabel("NAME");
		lblName.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 13));
		lblName.setBounds(12, 131, 143, 27);
		pn2.add(lblName);

		lblBirth = new JLabel("생년월일");
		lblBirth.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 13));
		lblBirth.setBounds(12, 192, 143, 27);
		pn2.add(lblBirth);

		JLabel lbGender = new JLabel("성별");
		lbGender.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 13));
		lbGender.setBounds(12, 260, 47, 27);
		pn2.add(lbGender);

		txtID = new JTextField();
		txtID.setBounds(12, 32, 143, 27);
		pn2.add(txtID);
		txtID.setColumns(10);

		FieldPassword1 = new JPasswordField();
		FieldPassword1.setBounds(9, 94, 143, 27);
		pn2.add(FieldPassword1);

		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(12, 155, 143, 27);
		pn2.add(txtName);

		txtYY = new JTextField();
		txtYY.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 13));
		txtYY.setHorizontalAlignment(SwingConstants.RIGHT);
		txtYY.setColumns(10);
		txtYY.setBounds(12, 223, 70, 27);
		pn2.add(txtYY);

		txtDD = new JTextField();
		txtDD.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDD.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 13));
		txtDD.setColumns(10);
		txtDD.setBounds(200, 223, 77, 27);
		pn2.add(txtDD);

		comboMM = new JComboBox();
		comboMM.setBackground(new Color(192, 192, 192));
		comboMM.setFont(new Font("굴림", Font.PLAIN, 12));
		comboMM.setModel(new DefaultComboBoxModel(
				new String[] { "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월" }));
		comboMM.setBounds(111, 223, 77, 27);
		pn2.add(comboMM);

		rdFemale = new JRadioButton("     여 자");
		buttonGroupGender.add(rdFemale);
		rdFemale.setBackground(new Color(192, 192, 192));
		rdFemale.setForeground(new Color(0, 0, 0));
		rdFemale.setFont(new Font("굴림", Font.PLAIN, 13));
		rdFemale.setBounds(12, 289, 95, 27);
		pn2.add(rdFemale);

		JRadioButton rdMale = new JRadioButton("     남 자");
		buttonGroupGender.add(rdMale);
		rdMale.setBackground(new Color(192, 192, 192));
		rdMale.setFont(new Font("굴림", Font.PLAIN, 13));
		rdMale.setBounds(111, 289, 95, 27);
		pn2.add(rdMale);

		JLabel lblYY = new JLabel("년");
		lblYY.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 13));
		lblYY.setBounds(86, 223, 33, 27);
		pn2.add(lblYY);

		JLabel lblDD = new JLabel("일");
		lblDD.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 13));
		lblDD.setBounds(283, 223, 33, 27);
		pn2.add(lblDD);

		btnDuplicate = new JButton("중복 확인");
		btnDuplicate.setFont(new Font("굴림", Font.BOLD, 13));
		btnDuplicate.setBackground(new Color(116, 116, 116));
		btnDuplicate.setForeground(new Color(192, 192, 192));
		btnDuplicate.setBounds(176, 32, 110, 27);
		btnDuplicate.setBorderPainted(false);
		btnDuplicate.setFocusPainted(false);
		pn2.add(btnDuplicate);

		JLabel lblNewLabel = new JLabel("TEL");
		lblNewLabel.setBounds(12, 322, 143, 27);
		pn2.add(lblNewLabel);

		cbTel1 = new JComboBox();
		cbTel1.setFont(new Font("Gulim", Font.PLAIN, 12));
		cbTel1.setBackground(new Color(192, 192, 192));
		cbTel1.setForeground(new Color(0, 0, 0));
		cbTel1.setModel(new DefaultComboBoxModel(new String[] { "010", "011", "017", "016", "043", "070", "050" }));
		cbTel1.setBounds(12, 348, 70, 27);
		pn2.add(cbTel1);

		txtTel2 = new JTextField();
		txtTel2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTel2.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 13));
		txtTel2.setColumns(10);
		txtTel2.setBounds(94, 346, 70, 27);
		pn2.add(txtTel2);

		txtTel3 = new JTextField();
		txtTel3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTel3.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 13));
		txtTel3.setColumns(10);
		txtTel3.setBounds(176, 346, 70, 27);
		pn2.add(txtTel3);

		passwordField2 = new JPasswordField();
		passwordField2.setBounds(173, 94, 143, 27);
		pn2.add(passwordField2);

		JLabel lblPassword2 = new JLabel("비밀번호 재확인");
		lblPassword2.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 13));
		lblPassword2.setBounds(173, 69, 143, 27);
		pn2.add(lblPassword2);

		JPanel pn3 = new JPanel();
		pn3.setBounds(0, 472, 386, 89);
		pn3.setLayout(null);
		getContentPane().add(pn3);

		JButton btnSignup = new JButton("가입하기");
		btnSignup.setBounds(12, 10, 362, 69);
		pn3.add(btnSignup);
		btnSignup.setBackground(new Color(57, 57, 57));
		btnSignup.setForeground(new Color(255, 255, 255));
		btnSignup.setFont(new Font("맑은 고딕 Semilight", Font.BOLD, 18));

		// --------------------- 위쪽은 UI ----------------------------------------
		setLocationRelativeTo(null); // 윈도우창을 가운데 정렬
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 종료버튼 활성화
		setVisible(true);
		// --------------------- 아래쪽은 메소드 ----------------------------------------

		// 중복 아이디 검사
		btnDuplicate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = txtID.getText().trim();

				// 아이디 유효성 검사
				if (!validateID(id)) {
					JOptionPane.showMessageDialog(Sign.this, "영문 소문자와 숫자로만 구성된 4~12자의 아이디를 입력하세요.", "경고",
							JOptionPane.WARNING_MESSAGE);
					return;
				}
				if (id.isEmpty()) {
					JOptionPane.showMessageDialog(Sign.this, "아이디를 입력해주세요.", "경고", JOptionPane.WARNING_MESSAGE);
					return;
				}
				boolean isMid = dao.checkDuplicate(id);
				if (isMid) {
					JOptionPane.showMessageDialog(Sign.this, "이미 사용 중인 아이디입니다.", "알림", JOptionPane.INFORMATION_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(Sign.this, "사용 가능한 아이디입니다.", "알림", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});

    //가입하기 버튼 마우스로 실행
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				signUp();
			}
		});
	}

	public void signUp() {
		String id = txtID.getText().trim();
		String password = new String(FieldPassword1.getPassword()).trim();
		String confirmPassword = new String(passwordField2.getPassword()).trim();
		String name = txtName.getText().trim();
		String year = txtYY.getText().trim();
		String month = comboMM.getSelectedItem().toString().replace("월", "").trim();
		String day = txtDD.getText().trim();
		String gender = rdFemale.isSelected() ? "여자" : "남자";
		String phoneNumber = cbTel1.getSelectedItem().toString() + "-" + txtTel2.getText().trim() + "-"
				+ txtTel3.getText().trim();

		// 아이디 유효성 검사
		if (!validateID(id)) {
			JOptionPane.showMessageDialog(this, "영문 소문자와 숫자로만 구성된 4~12자의 아이디를 입력하세요.", "유효성 검사", JOptionPane.WARNING_MESSAGE);
			return;
		}

		// 이름 유효성 검사
		if (!validateName(name)) {
			JOptionPane.showMessageDialog(this, "이름을 다시 입력해 주세요.", "경고", JOptionPane.WARNING_MESSAGE);
			return;
		}

		// 생년월일 유효성 검사
		if (!validateBirthdate(year, month, day)) {
			JOptionPane.showMessageDialog(this, "올바른 생년월일을 입력하세요.", "경고", JOptionPane.WARNING_MESSAGE);
			return;
		}
		
		//비밀번호 확인,재확인
		String passwordValidationMsg = validatePassword(password);
		if (!passwordValidationMsg.isEmpty()) {
			JOptionPane.showMessageDialog(this, passwordValidationMsg, "경고", JOptionPane.WARNING_MESSAGE);
			return;
		}

		if (!password.equals(confirmPassword)) {
			JOptionPane.showMessageDialog(this, "입력하신 두 비밀번호가 일치하지 않습니다.", "비밀번호 확인", JOptionPane.WARNING_MESSAGE);
			return;
		}

		// 전화번호 유효성 검사
		phoneNumber = phoneNumber.replace("-", ""); // 하이픈을 빼서 수정

		if (!validatePhoneNumber(phoneNumber)) {
			JOptionPane.showMessageDialog(this, "전화번호를 올바르게 작성해 주세요.", "경고", JOptionPane.WARNING_MESSAGE);
			return;
		}

		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setBirthday(year + month + day);
		vo.setGender(gender);
		vo.setPhonenumber(phoneNumber);

		 boolean join = dao.setSingInsert(vo);
	    if (join) {
	        JOptionPane.showMessageDialog(this, "회원 가입이 완료되었습니다.", "가입 성공", JOptionPane.INFORMATION_MESSAGE);
	        dispose(); 
	    } else {
	        JOptionPane.showMessageDialog(this, "회원 가입에 실패하였습니다. 다시 시도해주세요.", "가입 실패", JOptionPane.ERROR_MESSAGE);
	    }
	}

	public boolean validateBirthdate(String year, String month, String day) {
		// 연도, 월, 일이 숫자로만 구성되어 있는지 확인
		if (!year.matches("[0-9]+") || !month.matches("[0-9]+") || !day.matches("[0-9]+")) {
			return false;
		}

		// 월이 1부터 12까지의 숫자인지 확인
		int monthInt = Integer.parseInt(month) + 1; // 콤보상자의 월 인덱스는 0부터 시작하므로 1을 더해줌
		if (monthInt < 1 || monthInt > 12) {
			return false;
		}

		// 일이 유효한지 확인
		int dayInt = Integer.parseInt(day);
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (monthInt == 2 && isLeapYear(year)) {
			if (dayInt < 1 || dayInt > 29) {
				return false;
			}
		} else {
			if (dayInt < 1 || dayInt > daysInMonth[monthInt - 1]) {
				return false;
			}
		}

		return true;
	}

	//아이디 유효성검사 영어소문자,숫자 4자이상 12자이하
	public boolean validateID(String id) {
		return id.matches("[a-z0-9]{4,12}");
	}

	// 이름 유효성 검사 한글 6자이하)
	public boolean validateName(String name) {
		return name.matches("[가-힣]{1,6}");
	}

	// 윤년인지 확인
	private boolean isLeapYear(String year) {
		int yearInt = Integer.parseInt(year);
		return (yearInt % 4 == 0 && yearInt % 100 != 0) || (yearInt % 400 == 0);
	}

	//비밀번호 유효성
	private String validatePassword(String password) {
		if (password.length() < 8) {
			return "비밀번호는 최소 8자 이상이어야 합니다.";
		}
		return "";
	}

	// 전화번호 유효성 검사
	public boolean validatePhoneNumber(String phoneNumber) {
		// 숫자로만 구성되어 있고 11자리인지 확인
		return phoneNumber.matches("[0-9]+") && phoneNumber.length() == 11;
	}
	
	//생년월일 유효성 검사
	public boolean Birthdate(String Birthdate) {
		// 숫자로만 구성되어있는지,2자이하
		return Birthdate.matches("[0-9]+") && Birthdate.length() < 3;
	}

	public static void main(String[] args) {
		new Sign();
	}
}