package io.PeliculasIO;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

public class PeliculaSearchDataFile {


    public PeliculaSearchDataFile(String serieLink) throws IOException {
        // WE OBTAIN SEARCHDATA FROM HERE
        // Create json file with search data
        JSONObject json = new JSONObject(IOUtils.toString(new URL(serieLink), Charset.forName("UTF-8")));
        String searchData = json.toString();
        FileWriter file = new FileWriter("resources/files/movieData/movieSearch.json");
        file.write(searchData);
        file.close();
    }

}
