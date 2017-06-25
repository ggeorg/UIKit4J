#ifndef _OrgChamomileIosUikitUIPageControlStub_H_
#define _OrgChamomileIosUikitUIPageControlStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UIPageControl.h"

@interface UIPageControl (JavaUIPageControl) <OrgChamomileIosUikitUIPageControl>
@end

__attribute__((always_inline)) inline void UIPageControl_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIPageControl)

J2OBJC_TYPE_LITERAL_HEADER(UIPageControl)

// Empty class to force category to be loaded.
@interface JavaUIPageControlCategoryDummy : UIPageControl
@end

#endif // _OrgChamomileIosUikitUIPageControlStub_H_