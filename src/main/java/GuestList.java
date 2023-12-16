import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class GuestList {
    File guestListFile = new File("/Users/jakobschneider/Desktop/NeueFische/Projekte/GuestList/src/main/resources/guestList.txt");
    FileWriter guestListWriter;

    FileReader guestReader;


    List<String> guestList = new ArrayList<>();

    public GuestList() throws FileNotFoundException, IOException {
    }


    public void setGuestList(List<String> nameOfGuests) throws IOException {
        try{
            // Create new file

            File file = guestListFile;



            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            // Write in file
            nameOfGuests.stream().forEach(string -> {
                try {
                    bw.write(string.toString());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            };

            // Close connection
            bw.close();
        }
        catch(Exception e){
            System.out.println("False");
        }
    }




    public List<String> getGuestList() throws IOException {


        return List.of(readFromInputStream());
    }

    private String readFromInputStream() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(guestListFile));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            return everything;
        } finally {
            br.close();
        }

    }
}
