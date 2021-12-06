import Packet1.Person;

public class Test extends Person {
    public Test() {
        name = "Tom";
    }

        // public, private, default( все что default доступно в пределах этого пакета) , protected (доступны в пределах одного пакета,
        // доступны всем подкласам, даже если эти подклассы вне пакета)
}

