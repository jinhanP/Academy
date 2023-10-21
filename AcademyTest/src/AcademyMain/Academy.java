package AcademyMain;

import Controller.LessonRegisterManager;
import Controller.StudentRegisterManager;
import Controller.SubjectRegisterManager;
import Controller.TraineeRegisterManager;
import View.LESSON_CHOICE;
import View.MENU_CHOICE;
import View.MenuViewer;
import View.STUDENT_CHOICE;
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
	public static void subjectMenu() throws Exception {
		int choice;
		SubjectRegisterManager subjectManager = new SubjectRegisterManager();
		MenuViewer.subjectMenuView();
		choice = MenuViewer.scan.nextInt();
		MenuViewer.scan.nextLine();
		switch (choice) {
		case SUBJECT_CHOICE.LIST:
			System.out.println("");
			subjectManager.subjectList();
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
	public static void studentMenu() throws Exception {
		int choice;
		StudentRegisterManager studnetManager = new StudentRegisterManager();
		MenuViewer.studentMenuView();
		choice = MenuViewer.scan.nextInt();
		MenuViewer.scan.nextLine();
		switch (choice) {
		case STUDENT_CHOICE.INSERT:
			System.out.println("");
			studnetManager.studentRegistr();
			break;
		case STUDENT_CHOICE.UPDATE:
			System.out.println("");
			studnetManager.studentUpdate();
			break;
		case STUDENT_CHOICE.LIST:
			System.out.println("");
			studnetManager.studnetTotalList();
			break;
		case STUDENT_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}

	// 과목 메뉴
	public static void lessonMenu() throws Exception {
		int choice;
		LessonRegisterManager lessonManager = new LessonRegisterManager();
		MenuViewer.lessonMenuView();
		choice = MenuViewer.scan.nextInt();
		MenuViewer.scan.nextLine();
		switch (choice) {
		case LESSON_CHOICE.LIST:
			System.out.println("");
			lessonManager.lessonList();
			break;
		case LESSON_CHOICE.INSERT:
			System.out.println("");
			lessonManager.lessonRegistr();
			break;
		case LESSON_CHOICE.UPDATE:
			System.out.println("");
			lessonManager.lessonUpdate();
			break;
		case LESSON_CHOICE.DELETE:
			System.out.println("");
			lessonManager.lessonDelete();
			break;
		case LESSON_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
		}
	}

}
