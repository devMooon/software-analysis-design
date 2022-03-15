package practice01;

public class Main {
    public static void main(String[] args) {
    	// �ִ� 4���� �л��� ���� �� �ִ� �������Դ� �⼮�� ����
        LearningTogether learningTogether = new LearningTogether(4);
       
        // 4���� �л� �⼮�ο� �Է�
        learningTogether.appendStudent(new Student("������", "20201111"));
        learningTogether.appendStudent(new Student("������", "20201112"));
        learningTogether.appendStudent(new Student("�̼���", "20201113"));
        learningTogether.appendStudent(new Student("������", "20201114"));

		// �⼮���� Iterator�� ���´�.
        // ���� �����Ǵ� ��ü�� Ÿ���� LearningTogetherIterator
        Iterator it = learningTogether.iterator();
        
	// �л����� ����ؼ� ������ while ������ ����.
	// �л��� �� �ִ��� �˻��ϱ� ���ؼ�, iterator�� hasNext()�� ȣ���Ѵ�.
	while (it.hasNext()) {
		Student student = (Student)it.next(); // ���� �л��� ���´�.

		// �л��� �̸��� ����Ѵ�.
		System.out.print("" + student.getName());
		System.out.println(" " + student.getStudentId());
		System.out.println("--------------------");
			
        }
    }
}