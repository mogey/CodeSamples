public class Rational{
    private int numo;
    private int deno;
    public Rational(){
        this.numo = 0;
        this.deno = 0;
    }
    public Rational(int newNum, int newDen){
        this.numo = newNum;
        this.deno = newDen;
    }
    public Rational sum(Rational other){
        if (this.getDeno() == 0 || other.getDeno() == 0){
            Rational error = new Rational(0,0);
            return error;
        }
        else{
            int commonDeno = this.getDeno() * other.getDeno();
            int myNumo = this.getNumo() * other.getDeno();
            int otherNumo = other.getNumo() * this.getDeno();
            int resultingNumo = myNumo + otherNumo;
            int gcd = euclid(resultingNumo, commonDeno);
            commonDeno /= gcd;
            resultingNumo /= gcd;
            if(commonDeno < 0){
                commonDeno *= -1;
                resultingNumo *= -1;
            }
            Rational result = new Rational(resultingNumo, commonDeno);
            return result;
        }
    }
    public Rational subtract(Rational other){
        if (this.getDeno() == 0 || other.getDeno() == 0){
            Rational error = new Rational(0,0);
            return error;
        }
        else{
            int commonDeno = this.getDeno() * other.getDeno();
            int myNumo = this.getNumo() * other.getDeno();
            int otherNumo = other.getNumo() * this.getDeno();
            int resultingNumo = myNumo - otherNumo;
            int gcd = euclid(resultingNumo, commonDeno);
            commonDeno /= gcd;
            resultingNumo /= gcd;
            if(commonDeno < 0){
                commonDeno *= -1;
                resultingNumo *= -1;
            }
            Rational result = new Rational(resultingNumo, commonDeno);
            return result;
        }
    }
    public Rational multiply(Rational other){
        if (this.getDeno() == 0 || other.getDeno() == 0){
            Rational error = new Rational(0,0);
            return error;
        }
        else{
            int commonDeno = this.getDeno() * other.getDeno();
            int resultingNumo = this.getNumo() * other.getNumo();
            int gcd = euclid(resultingNumo, commonDeno);
            commonDeno /= gcd;
            resultingNumo /= gcd;
            if(commonDeno < 0){
                commonDeno *= -1;
                resultingNumo *= -1;
            }
            Rational result = new Rational(resultingNumo, commonDeno);
            return result;
        }
    }
    public Rational divide(Rational other){
        if (this.getDeno() == 0 || other.getNumo() == 0){
            Rational error = new Rational(0,0);
            return error;
        }
        else{
            Rational reciprocal = new Rational(other.getDeno(), other.getNumo());
            Rational result = this.multiply(reciprocal);
            return result;
        }
    }
    public static int euclid(int nNumo, int nDeno) {
        if (nDeno == 0){
            return nNumo;
        }else {
            return euclid(nDeno, nNumo % nDeno);
        }
    }
    public void setNumo(int newNumo){
        this.numo = newNumo;
    }
    public void setDeno(int newDeno){
        this.deno = newDeno;
    }
    public int getNumo(){
        return this.numo;
    }
    public int getDeno(){
        return this.deno;
    }
    public float toFloatString(){
        float r = (float) this.getNumo() / this.getDeno();
        return r;
    }
    public String toString(){
        return this.getNumo() + "/" + this.getDeno();
    }
}