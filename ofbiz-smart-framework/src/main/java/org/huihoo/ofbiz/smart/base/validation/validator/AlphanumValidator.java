package org.huihoo.ofbiz.smart.base.validation.validator;


import org.huihoo.ofbiz.smart.base.util.CommUtil;
import org.huihoo.ofbiz.smart.base.validation.Alphanum;
import org.huihoo.ofbiz.smart.base.validation.ConstraintValidator;

public class AlphanumValidator implements ConstraintValidator<Alphanum, CharSequence> {

  public static final String REGEX_ALPHANUM = "^[a-zA-Z0-9]+$";
  public static final java.util.regex.Pattern ALPHANUM_PATTERN = java.util.regex.Pattern.compile(REGEX_ALPHANUM);

  @Override
  public void initialize(Alphanum constraintAnnotation) {

  }

  @Override
  public boolean isValid(CharSequence value) {
    if (CommUtil.isEmpty(value)) {
      return true;
    }
    return ALPHANUM_PATTERN.matcher(value).matches();
  }
}
