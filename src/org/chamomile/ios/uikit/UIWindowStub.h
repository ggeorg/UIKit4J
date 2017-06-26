#ifndef _OrgChamomileIosUikitUIWindowStub_H_
#define _OrgChamomileIosUikitUIWindowStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIWindow.h"

@interface UIWindow (JavaUIWindow) <OrgChamomileIosUikitUIWindow>
@end

__attribute__((always_inline)) inline void UIWindow_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIWindow)

J2OBJC_TYPE_LITERAL_HEADER(UIWindow)

// Empty class to force category to be loaded.
@interface JavaUIWindowCategoryDummy : UIWindow
@end

#endif // _OrgChamomileIosUikitUIWindowStub_H_