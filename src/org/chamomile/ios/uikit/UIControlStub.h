#ifndef _OrgChamomileIosUikitUIControlStub_H_
#define _OrgChamomileIosUikitUIControlStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIControl.h"

@interface UIControl (JavaUIControl) <OrgChamomileIosUikitUIControl>
@end

__attribute__((always_inline)) inline void UIControl_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIControl)

J2OBJC_TYPE_LITERAL_HEADER(UIControl)

// Empty class to force category to be loaded.
@interface JavaUIControlCategoryDummy : UIControl
@end

#endif // _OrgChamomileIosUikitUIControlStub_H_
