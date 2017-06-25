#ifndef _OrgChamomileIosUikitUIPickerViewStub_H_
#define _OrgChamomileIosUikitUIPickerViewStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIPickerView.h"

@interface UIPickerView (JavaUIPickerView) <OrgChamomileIosUikitUIPickerView>
@end

__attribute__((always_inline)) inline void UIPickerView_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIPickerView)

J2OBJC_TYPE_LITERAL_HEADER(UIPickerView)

// Empty class to force category to be loaded.
@interface JavaUIPickerViewCategoryDummy : UIPickerView
@end

#endif // _OrgChamomileIosUikitUIPickerViewStub_H_