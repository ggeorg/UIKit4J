#ifndef _OrgChamomileIosUikitUISwitchStub_H_
#define _OrgChamomileIosUikitUISwitchStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UISwitch.h"

@interface UISwitch (JavaUISwitch) <OrgChamomileIosUikitUISwitch>
@end

__attribute__((always_inline)) inline void UISwitch_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UISwitch)

J2OBJC_TYPE_LITERAL_HEADER(UISwitch)

// Empty class to force category to be loaded.
@interface JavaUISwitchCategoryDummy : UISwitch
@end

#endif // _OrgChamomileIosUikitUISwitchStub_H_