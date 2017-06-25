#ifndef _OrgChamomileIosUikitUISliderStub_H_
#define _OrgChamomileIosUikitUISliderStub_H_

#include <UIKit/UIKit.h>

#include "J2ObjC_common.h"
#include "UIKit4J_common.h"

#include "UISlider.h"

@interface UISlider (JavaUISlider) <OrgChamomileIosUikitUISlider>
@end

__attribute__((always_inline)) inline void UISlider_init(NSObject *self) {
    #pragma unused(self)
}

J2OBJC_EMPTY_STATIC_INIT(UISlider)

J2OBJC_TYPE_LITERAL_HEADER(UISlider)

// Empty class to force category to be loaded.
@interface JavaUISliderCategoryDummy : UISlider
@end

#endif // _OrgChamomileIosUikitUISliderStub_H_