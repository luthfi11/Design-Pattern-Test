package builder;

class Store {
    private String name;
    private String city;
    private String category;
    private double rating;

    void setName(String name) {
        this.name = name;
    }

    void setCity(String city) {
        this.city = city;
    }

    void setCategory(String category) {
        this.category = category;
    }

    void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Nama toko : "+name+"\nKota : "+city+"\nKategory : "+category+"\nRating : "+rating;
    }
}
