#ifndef _OrgChamomileIosUikitUISegmentedControlStub_H_
#define _OrgChamomileIosUikitUISegmentedControlStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UISegmentedControl.h"

@interface UISegmentedControl (JavaUISegmentedControl) <OrgChamomileIosUikitUISegmentedControl>
@end

__attribute__((always_inline)) inline void UISegmentedControl_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UISegmentedControl)

J2OBJC_TYPE_LITERAL_HEADER(UISegmentedControl)

// Empty class to force category to be loaded.
@interface JavaUISegmentedControlCategoryDummy : UISegmentedControl
@end

#endif // _OrgChamomileIosUikitUISegmentedControlStub_H_