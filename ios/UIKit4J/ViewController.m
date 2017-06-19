//
//  ViewController.m
//  UIKit4J
//
//  Created by George Georgopoulos on 18/06/2017.
//  Copyright © 2017 Chamomile. All rights reserved.
//

#import "ViewController.h"

#import "Showcase.h"

#import "UIButton.h"
#import "UIViewStub.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view, typically from a nib.
    
    //[UIButton buttonWithType:UIButtonTypeRoundedRect];
    
    id<OrgChamomileIosUikitUIView> view = (id<OrgChamomileIosUikitUIView>)self.view;
    NSLog(@"====>%@", [OrgChamomileIosUikitUIView getFrameWithOrgChamomileIosUikitUIView:view]);
    
    NSLog(@"=====%f", [self.view alpha]);
    [self.view setAlpha:.5];
          
    UIButton *btn = (UIButton *)[OrgChamomileIosShowcase createButtonWithInt:UIButtonTypeRoundedRect];
    [btn setFrame:CGRectMake(52, 252, 215, 40)];
    
    [OrgChamomileIosShowcase addSubviewWithOrgChamomileIosUikitUIView:(id<OrgChamomileIosUikitUIView>)self.view
                 withOrgChamomileIosUikitUIButton:(id<OrgChamomileIosUikitUIButton>)btn];
}


- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}


@end
