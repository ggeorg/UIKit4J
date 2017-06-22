#ifndef _OrgChamomileIosUikitUILabelStub_H_
#define _OrgChamomileIosUikitUILabelStub_H_

#import <UIKit/UIKit.h>

#include "J2ObjC_common.h"

#include "org/chamomile/ios/uikit/UILabel.h"

@interface UILabel (JavaUILabel) <OrgChamomileIosUikitUILabel>
@end

__attribute__((always_inline)) inline void UILabel_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UILabel)

J2OBJC_TYPE_LITERAL_HEADER(UILabel)

// Empty class to force category to be loaded.
@interface JavaUILabelCategoryDummy : UILabel
@end

#endif // _OrgChamomileIosUikitUILabelStub_H_
