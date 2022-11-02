package dvdStore.repository.file;


import dvdStore.entity.Movie;
import dvdStore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Repository
public class FileMovieRepository implements MovieRepositoryInterface {

    @Value("${movies.file.location}")
    private File file;

    public void add(Movie movie) {
        FileWriter writer;
        try {
            writer = new FileWriter(file, true);
            writer.write(movie.getTitle() + ";" + movie.getGenre() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The movie " + movie.getTitle() + " Of genre " + movie.getGenre() + " has been added successfully.");
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
