
import java.math.BigInteger;
public class CalcModel {

 static final String INITIAL_VALUE = "1";

 private BigInteger m_total; 


 CalcModel() {
 reset();
 }

 public void reset() {
 m_total = new BigInteger(INITIAL_VALUE);
 }


 public void multiplyBy(String operand) {
 m_total = m_total.multiply(new BigInteger(operand));
 }

 public void setValue(String value) {
 m_total = new BigInteger(value);
 }

 public String getValue() {
 return m_total.toString();
 }

public void addBy(String userInput) {
	// TODO Auto-generated method stub
	m_total = m_total.add(new BigInteger(operand));
}
}