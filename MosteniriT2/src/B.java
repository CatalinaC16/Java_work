public class B extends A {
int x = 15;
int y = getPlusX();
public B() {
x = 2 * x;
y = y + 3;
}
public int getPlusX() {
return x+2;
}
public int getY() {
return y;
}
public String toString() {
return "Clasa derivata";
}
}