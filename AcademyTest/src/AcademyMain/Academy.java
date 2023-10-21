package AcademyMain;
import Controller.StudentRegisterManager;
import Controller.SubjectRegisterManager;
import Controller.TraineeRegisterManager;
import View.MENU_CHOICE;
import View.MenuViewer;
import View.SUBJECT_CHOICE;
import View.TRAINEE_CHOICE;

public class Academy {

	public static void main(String[] args) {
		mainMenu();

	}

	private static void mainMenu() {
		int choiceNum = 0;
		boolean stopFlag = false;
		while (!stopFlag) {
			try {
				// 메인메뉴를 화면출력
				MenuViewer.mainMenuView();
				// 키보드 입력
				choiceNum = MenuViewer.scan.nextInt();
				// 입력 버퍼 클리어
				MenuViewer.scan.nextLine();

				switch (choiceNum) {
				case MENU_CHOICE.SUBJECT:
					subjectMenu();
					break;
				case MENU_CHOICE.STUDENT:
					studentMenu();
					break;
				case MENU_CHOICE.LESSON:
					lessonMenu();
					break;
				case MENU_CHOICE.TRAINEE:
					traineMenu();
					break;
				case MENU_CHOICE.EXIT:
					System.out.println("프로그램을 종료합니다.");
					stopFlag = true;
					break;
				default:
					System.out.println("해당 메뉴 번호만 입력하세요.");
				}
			} catch (Exception e) {
				System.out.println("\n입력에 오류가 있습니다.\n프로그램을 다시 시작하세요.");
				return;
			}
		}
	}

	// 수강 신청 메뉴
	private static void traineMenu() throws Exception {
		int choice;

		TraineeRegisterManager traineManager = new TraineeRegisterManager();
		MenuViewer.traineMenuView();
		choice = MenuViewer.scan.nextInt();
		MenuViewer.scan.nextLine();

		switch (choice) {
		case TRAINEE_CHOICE.LIST:
			System.out.println("");
			traineManager.traineeList();
			break;
		case TRAINEE_CHOICE.INSERT:
			System.out.println("");
			traineManager.traineeRegistr();
			break;
		case TRAINEE_CHOICE.UPDATE:
			System.out.println("");
			traineManager.traineeDelete();
			break;
		case TRAINEE_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}

	// 학과 메뉴
	private static void lessonMenu() throws Exception {
		int choice = 0;
		// 학과정보를 curd를 위한 컨트롤러
		SubjectRegisterManager subjectManager = new SubjectRegisterManager();
		// 학과메뉴선택 디스플레이
		MenuViewer.subjectMenuView();
		// 학과 메뉴 입력
		choice = MenuViewer.scan.nextInt();
		MenuViewer.scan.nextLine();
		switch (choice) {
		case SUBJECT_CHOICE.LIST:
			System.out.println("");
			break;
		case SUBJECT_CHOICE.INSERT:
			System.out.println("");
			subjectManager.subjectRegistr();
			break;
		case SUBJECT_CHOICE.UPDATE:
			System.out.println("");
			subjectManager.subjectUpdate();
			break;
		case SUBJECT_CHOICE.DELETE:
			System.out.println("");
			subjectManager.subjectDelete();
			break;
		case SUBJECT_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}

	// 학생 메뉴
	private static void studentMenu()throws Exception {
		int choice;
		// 학과정보를 curd를 위한 컨트롤러
		 StudentRegisterManager studentManager = new StudentRegisterManager();
		// 학과메뉴선택 디스플레이
		MenuViewer.studentMenuView();
		// 학과 메뉴 입력
		choice = MenuViewer.scan.nextInt();
		MenuViewer.scan.nextLine();

		switch (choice) {
		case SUBJECT_CHOICE.LIST:
			System.out.println("");
			break;
		case SUBJECT_CHOICE.INSERT:
			System.out.println("");
			studentManager.studentRegistr();
			break;
		case SUBJECT_CHOICE.UPDATE:
			System.out.println("");
			studentManager.studentUpdate();
			break;
		case SUBJECT_CHOICE.DELETE:
			System.out.println("");
			studentManager.studnetTotalList();
			break;
		case SUBJECT_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}

	// 과목 메뉴
	private static void subjectMenu()throws Exception {
		int choiceNum;
//     	 LessonRegisterManager lessonManager = new LessonRegisterManager();
		MenuViewer.subjectMenuView();
		choiceNum = Integer.parseInt(MenuViewer.scan.nextLine());
		switch (choiceNum) {
		case SUBJECT_CHOICE.LIST:
			System.out.println("");
//			 subjectManager.subjectList();
			break;
		case SUBJECT_CHOICE.INSERT:
			System.out.println("");
//			 subjectManager.subjectRegistr();
			break;
		case SUBJECT_CHOICE.UPDATE:
			System.out.println("");
//			 subjectManager.subjectUpdate();
			break;
		case SUBJECT_CHOICE.DELETE:
			System.out.println("");
//			 subjectManager.subjectDelete();
			break;
		case SUBJECT_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}

	}

}
