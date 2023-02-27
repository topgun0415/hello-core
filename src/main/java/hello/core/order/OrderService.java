package hello.core.order;

public interface OrderService {

    /**
     *
     * @param memberId 상품아이디
     * @param itemName 상품명
     * @param itemPrice 상품가격
     * @return Order 새로운 주문내역
     */
    Order createOrder(Long memberId, String itemName, int itemPrice);


}
