package demo.Service;

import demo.common.ServerResponse;
import demo.vo.CartVo;

public interface CartService {

    ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);
    ServerResponse<CartVo> update(Integer uesrId, Integer productId, Integer count);
    ServerResponse<CartVo> deleteProduct(Integer userId, String productIds);
    ServerResponse<CartVo> list(Integer userId);
    ServerResponse<CartVo> selectOrUnSelect(Integer userId,Integer productId, Integer checked);
    ServerResponse<Integer> getCartProductCount(Integer userId);
}
