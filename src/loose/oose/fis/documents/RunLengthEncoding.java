
package loose.oose.fis.documents;

public class RunLengthEncoding extends Document{
    public RunLengthEncoding(String [] continut){super(continut);}
    public String[] analizeaza(){
        String[] res = new String[continut.length];
        int      pos = 0;

        for (String cuvant : continut) {
            res[pos] = cuvant.toUpperCase();
            pos++;

        }

        return res;
    }



}