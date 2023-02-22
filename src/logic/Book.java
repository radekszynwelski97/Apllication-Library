package logic;


    public class Book {
        private String tittle;
        private String author ;
        private int yearsOfPublishment;
        private int pages ;
        private String publisher ;
        private String ISBN;

        public Book(String tittle, String author, int yearsOfPublishment, int pages, String publisher, String ISBN) {
            this(tittle, author, yearsOfPublishment, pages, publisher);
            this.ISBN = ISBN;
        }

        public Book(String tittle, String author, int yearsOfPublishment, int pages, String publisher) {
            this(tittle, author, yearsOfPublishment, pages);
            this.publisher = publisher;
        }

        public Book(String tittle, String author, int yearsOfPublishment, int pages) {
            this.tittle = tittle;
            this.author = author;
            this.yearsOfPublishment = yearsOfPublishment;
            this.pages = pages;
        }


        public String getTittle() {
            return tittle;
        }

        public void setTittle(String tittle) {
            this.tittle = tittle;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getYearsOfPublishment() {
            return yearsOfPublishment;
        }

        public void setYearsOfPublishment(int yearsOfPublishment) {
            this.yearsOfPublishment = yearsOfPublishment;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public  void printInfo () {
            String info = tittle+ " ; " +   author  + " ; " + yearsOfPublishment  + " ; " + pages + " ;" +
                    publisher   ;
            if (ISBN != null) {
                info = info + ";" + ISBN ;
            }
            System.out.println(info);

        }
        public void Info2(){
            String info = tittle+ " ; " +   author  + " ; " + yearsOfPublishment  + " ; " + pages ;
            if (publisher != null){
                info = info + " ; " + publisher;

            }
            System.out.println(info);


        }


    }

