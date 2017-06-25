#ifndef _OrgChamomileIosUikitUIDatePickerStub_H_
#define _OrgChamomileIosUikitUIDatePickerStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIDatePicker.h"

@interface UIDatePicker (JavaUIDatePicker) <OrgChamomileIosUikitUIDatePicker>
@end

__attribute__((always_inline)) inline void UIDatePicker_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIDatePicker)

J2OBJC_TYPE_LITERAL_HEADER(UIDatePicker)

// Empty class to force category to be loaded.
@interface JavaUIDatePickerCategoryDummy : UIDatePicker
@end

#endif // _OrgChamomileIosUikitUIDatePickerStub_H_