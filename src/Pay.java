import java.io.*;

public class Pay {
    public static void main(String[] args) {
        String str;

        try (FileInputStream inputStreamLocal = new FileInputStream("C:/Users/jamal/Desktop/payments_input.txt");
             InputStreamReader inputStreamReaderLocal = new InputStreamReader(inputStreamLocal, "CP1251");
             BufferedReader bufferReaderLocal = new BufferedReader(inputStreamReaderLocal)) {

            bufferReaderLocal.readLine();
            int count = 1;

            while ((str = bufferReaderLocal.readLine()) != null) {
                String[] line = str.split("\\|");
                Payments payments = new Payments(line[0], line[1], line[2]);

                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("payments" + count + ".dat"));
                oos.writeObject(payments);
                count++;
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
