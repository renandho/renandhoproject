package com.fif.hcms.core.upload;

import java.util.Map;

public interface Converter<T> {

	T convert(Map<String, Object> params);

}
