#ifndef _OrgChamomileIosUikitUIScreenStub_H_
#define _OrgChamomileIosUikitUIScreenStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIScreen.h"

@interface UIScreen (JavaUIScreen) <OrgChamomileIosUikitUIScreen>
@end

__attribute__((always_inline)) inline void UIScreen_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIScreen)

J2OBJC_TYPE_LITERAL_HEADER(UIScreen)

// Empty class to force category to be loaded.
@interface JavaUIScreenCategoryDummy : UIScreen
@end

#endif // _OrgChamomileIosUikitUIScreenStub_H_