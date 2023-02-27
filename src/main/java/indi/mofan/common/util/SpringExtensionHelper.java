package indi.mofan.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.TypeDescriptor;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * @author mofan
 * @date 2023/2/27 21:49
 */
@Component
public class SpringExtensionHelper implements ApplicationContextAware {
    private static ApplicationContext context;

    public static final String CONVERSION_SERVICE_BEAN_NAME = "myConversionService";

    private static ConversionService getConversionService() {
        return context.getBean(CONVERSION_SERVICE_BEAN_NAME, ConversionService.class);
    }

    public static <T> T convert(Object source, Class<T> targetType) {
        return getConversionService().convert(source, targetType);
    }


    public static Object convert(Object source, TypeDescriptor sourceType, TypeDescriptor targetType) {
        return getConversionService().convert(source, sourceType, targetType);
    }

    @SuppressWarnings("unchecked")
    public static <T, R> List<R> convertList(List<T> source, Class<R> targetClass) {
        if (CollectionUtils.isEmpty(source)) {
            return Collections.emptyList();
        }
        return (List<R>) convert(
                source,
                TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(source.get(0).getClass())),
                TypeDescriptor.collection(List.class, TypeDescriptor.valueOf(targetClass))
        );
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringExtensionHelper.context = applicationContext;
    }
}
