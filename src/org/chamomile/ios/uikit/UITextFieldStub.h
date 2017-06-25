#ifndef _OrgChamomileIosUikitUITextFieldStub_H_
#define _OrgChamomileIosUikitUITextFieldStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UITextField.h"

@interface UITextField (JavaUITextField) <OrgChamomileIosUikitUITextField>
@end

__attribute__((always_inline)) inline void UITextField_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UITextField)

J2OBJC_TYPE_LITERAL_HEADER(UITextField)

// Empty class to force category to be loaded.
@interface JavaUITextFieldCategoryDummy : UITextField
@end

#endif // _OrgChamomileIosUikitUITextFieldStub_H_