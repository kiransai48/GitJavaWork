package mycollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
enum difficultyLevel {
	EASY,MEDIUM,COMPLEX
	
}

class QPaper
{
	private Set QPset;
	private String subject;
	
	private char setCode;
	public Set getQPset() {
		return QPset;
	}
	public void setQPset(Set qPset) {
		QPset = qPset;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public char getSetCode() {
		return setCode;
	}
	public void setSetCode(char setCode) {
		this.setCode = setCode;
	}
	
}
class Question
{
	private int qno;
	private String question;
	private ArrayList answerList;
	private difficultyLevel QPlevel=difficultyLevel.EASY;
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public ArrayList getAnswerList() {
		return answerList;
	}
	public void setAnswerList(ArrayList answerList) {
		this.answerList = answerList;
	}
	public difficultyLevel getQPlevel() {
		return QPlevel;
	}
	public void setQPlevel(difficultyLevel qPlevel) {
		QPlevel = qPlevel;
	}
}
public class QuestionPaper {
public static void main(String [] args)
{
	QPaper qp=new QPaper();
	qp.setSubject("Java");
	qp.setSetCode('c');
	Set<Question> myset=new HashSet<Question>();
	Question Q= new Question();
	Q.setQno(1);
	List myAnswerList=new ArrayList();
	//myAnswerList.add()
	Q.setAnswerList(null);
	Q.setQPlevel(difficultyLevel.EASY);
	Q.setQuestion("How to prevent inheritance in java");
	myset.add(Q);
	qp.setQPset(myset);
}
}
