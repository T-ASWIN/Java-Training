package bufferprogram;

public class timecompelcity {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        StringBuffer sb=new StringBuffer("java");
        for(int i=0;i<1000000;i++){
            sb.append("tpoint");
        }
        System.out.println("Time taken by stringBuffer:"+(System.currentTimeMillis()-startTime)+"ms");

        startTime=System.currentTimeMillis();
        StringBuilder sb2=new StringBuilder("java");
        for(int i=0;i<1000000;i++){
            sb2.append("tpoint");
        }
        System.out.println("Time taken by stringBuilder:"+(System.currentTimeMillis()-startTime)+"ms");

    }
}
