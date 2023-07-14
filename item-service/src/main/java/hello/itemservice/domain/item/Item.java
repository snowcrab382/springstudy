package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data 제공하는 모든 필드에 대해 생성자, getter, setter, toString, equals, hashCode 등을 자동으로 생성해준다.
// 그렇기 때문에 @Data는 주로 DTO, VO 객체에서 사용한다.
// 하지만 이러한 것들 때문에 핵심 서비스 로직에 사용할 경우 의도치 않은 오류가 발생할 수 있어서 주의해야함
@Getter @Setter
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {

    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
