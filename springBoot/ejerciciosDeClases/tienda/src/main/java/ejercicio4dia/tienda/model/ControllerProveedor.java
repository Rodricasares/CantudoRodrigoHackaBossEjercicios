package ejercicio4dia.tienda.model;

public class ControllerProveedor {
private int id;
    private String name;
    private String company;
    private String product;


    public ControllerProveedor() {
    }

    public ControllerProveedor(int id, String name, String company, String product) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }
}
