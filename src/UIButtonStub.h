#ifndef _OrgChamomileIosUikitUIButtonStub_H_
#define _OrgChamomileIosUikitUIButtonStub_H_

#import <UIKit/UIKit.h>

#include "J2ObjC_common.h"

#include "UIButton.h"

@interface UIButton (JavaUIButton) <OrgChamomileIosUikitUIButton>

@end

__attribute__((always_inline)) inline void UIButton_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UIButton)

J2OBJC_TYPE_LITERAL_HEADER(UIButton)

// Empty class to force category to be loaded.
@interface JavaUIButtonCategoryDummy : UIButton
@end

#endif // _OrgChamomileIosUikitUIButtonStub_H_
