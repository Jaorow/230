enum Month {
    JAN("January brings the snow"),FEB("February brings the rain"),MAR("March brings breezes loud and shril"),APR("April brings the primrose sweet");

    private Month(String poem){
        this.poem = poem;
    }

    private String poem;
    
    public String getPoem() {
        return this.poem;
    }

}