package com.chuxin.eshop.auth.mapstruct;

import com.chuxin.eshop.auth.domain.PriorityDO;
import com.chuxin.eshop.auth.domain.PriorityDTO;
import com.chuxin.eshop.auth.domain.PriorityVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author chuxin
 * @ClassName PrioritySwitcher
 * @Date 2021/12/9 12:12 AM
 * @Description: 权限模块-层对象转换类
 */
@Mapper(componentModel = "spring")
public interface PrioritySwitcher {

    PrioritySwitcher INSTANCE = Mappers.getMapper(PrioritySwitcher.class);

    /**
     * 将 PriorityDTO 对象转换为 PriorityVO 对象
     * @param priorityDTO
     * @return PriorityVO 对象
     */
    PriorityVO dto2VO(PriorityDTO priorityDTO);

    /**
     * 将 PriorityDO 对象转换为 PriorityDTO 对象
     * @param priorityDO
     * @return PriorityDTO 对象
     */
    PriorityDTO do2DTO(PriorityDO priorityDO);

    /**
     * 将 PriorityDTO 的 List 转换成为 PriorityVO List
     * @param dtoList PriorityDTO 对象集合
     * @return PriorityVO 对象集合
     */
    List<PriorityVO> dtoList2VOList(List<PriorityDTO> dtoList);

    /**
     * 将 PriorityDO 的 List 转换成为 PriorityDTO List
     * @param doList PriorityDO 对象集合
     * @return PriorityDTO 对象集合
     */
    List<PriorityDTO> doList2DTOList(List<PriorityDO> doList);
}
