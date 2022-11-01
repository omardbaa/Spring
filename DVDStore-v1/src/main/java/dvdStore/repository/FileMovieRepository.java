package dvdStore.repository;

import dvdStore.entity.Movie;
import dvdStore.genercInterface.MovieRepositoryInterface;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements MovieRepositoryInterface {
    private File file ;
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }


    public void add(Movie movie){
        FileWriter writer;
        try{
            writer=new FileWriter(file,true);
            writer.write(movie.getTitle()+";"+movie.getGenre()+"\n");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("The movie "+movie.getTitle()+" has been added successfully.");
    }
}
