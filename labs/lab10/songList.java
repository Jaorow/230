import java.util.ArrayList;

import javax.swing.AbstractListModel;

class SongListModel<Song> extends AbstractListModel<Song> {
    private ArrayList<Song> songs;
    public SongListModel(){
        songs = new ArrayList<Song>();
    }

    @Override
    public int getSize() {
        return songs.size();
    }

    @Override
    public Song getElementAt(int index) {
        return songs.get(index);
    }
    public void addElement(Song element){
        songs.add(element);
        fireIntervalAdded(element, getSize()-1, getSize()-1);
    }
    public void removeElementAt(int index){
        songs.remove(index);
        fireIntervalRemoved(listenerList, index, index);
    }   

}
