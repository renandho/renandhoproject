package com.shop.core.upload;

import java.util.List;

public interface ConverterList<T> {

	List<T> convert(List<T> objects);

}
