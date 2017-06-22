#ifndef _OrgChamomileIosUikitUIColorStub_H_
#define _OrgChamomileIosUikitUIColorStub_H_

#import <UIKit/UIKit.h>

#include "J2ObjC_common.h"

#include "org/chamomile/ios/uikit/UIColor.h"

@interface UIColor (JavaUIColor) <OrgChamomileIosUikitUIColor>

@end

__attribute__((always_inline)) inline void UIColor_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIColor)

J2OBJC_TYPE_LITERAL_HEADER(UIColor)

// Empty class to force category to be loaded.
@interface JavaUIColorCategoryDummy : UIColor
@end

#endif // _OrgChamomileIosUikitUIColorStub_H_
